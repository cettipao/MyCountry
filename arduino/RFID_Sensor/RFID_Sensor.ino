//RFID
#include <SPI.h>
#include <MFRC522.h>
 
#define SS_PIN 10
#define RST_PIN 9
#define rele 7
char mens = 0;
String id = "";
MFRC522 mfrc522(SS_PIN, RST_PIN);   // Create MFRC522 instance.
 
void setup() 
{
  Serial.begin(9600);   // Initiate a serial communication
  SPI.begin();      // Initiate  SPI bus
  mfrc522.PCD_Init();   // Initiate MFRC522
  pinMode(rele,OUTPUT);
  digitalWrite(rele,HIGH);

}
void loop() 
{
  if(Serial.available() > 0){
    mens = Serial.read();
    if (mens == 'p'){
      digitalWrite(rele, LOW);
      delay(2000);
      digitalWrite(rele, HIGH);
    }
  }
  // Look for new cards
  if ( ! mfrc522.PICC_IsNewCardPresent()) 
  {
    return;
  }
  // Select one of the cards
  if ( ! mfrc522.PICC_ReadCardSerial()) 
  {
    return;
  }
  //Show UID on serial monitor
  String content= "";
  byte letter;
  for (byte i = 0; i < mfrc522.uid.size; i++) 
  {
     //Serial.print(mfrc522.uid.uidByte[i] < 0x10 ? " 0" : " ");
     //Serial.print(mfrc522.uid.uidByte[i], HEX);
     content.concat(String(mfrc522.uid.uidByte[i] < 0x10 ? " 0" : " "));
     content.concat(String(mfrc522.uid.uidByte[i], HEX));
  }
  content.toUpperCase();/*
  if (content.substring(1) == id){
    return;
  }
  else{*/
    Serial.print(content.substring(1));
    Serial.println("");
    id = content.substring(1);

  /*}*/
  
  
}

 
