# MyCountry

Objetivo: Mejorar Guardia de una comunidad cerrada o barrio privado, se automatizan tanto ingresos como egresos para los propietarios y visitantes.

Se ilumina un led para indicar el ingreso autorizado de la persona

Apartado propietarios.
  Lector de RFID con arduino.
  https://jonathanmelgoza.com/blog/comunicacion-serial-en-java/
  ver link para comunicar puertos con programa de JAVA

  Basicamente es el ingreso y egreso de los propietarios mediante alguna tarjeta o tag con RFID y la comunicacion con el  programa mediante el microprocesador ARDUINO.
  Se podra incorporar otra tarjeta o tag y cambiar el propietario de la misma mediante un apartado de configuracion
  
  Sistema para Propietarios
    Mediante este sistema el propietario podra invitar a sus visitantes y facilitarles su ingreso al barrio y el trabajo de los guardias mediante un codigo Qr.
    

Apartado Visitantes
  https://stackoverflow.com/questions/10473277/webcam-detect-qr-code-take-snapshot-and-decode

  Ingreso y Egreso de los visitantes de propietarios mediante el uso de un codigo Qr valido para un ingreso y para un egreso.
  Este codigo Qr tendra el ID del visitante con toda su informacion proporcionada por el Propietario anfitrion
