var constant = 7.00;
var global = 13.00;
main_init();

function main_init() {
   let capacityArray = ["Hello ", "Herr ", "Einstein "];
   let boundaryArray = [4.00, 5.00, 6.00, 7.00, 8.00];
   let message;
   let isTrue = true ;
   let number = 1.00;
   let novaNumero;
   message = prompt("Input");
   alert("Hello "+message );
   number = 
mathematics(number );
   
   isTrue = 
truth(isTrue );
   
   novaNumero = 
ultimateNumber((constant + global) + (mathematics (number )));
   
   mutateNumber(number / 9.00);
   traverseArray(capacityArray );
}

function mathematics(number) {
   number = number * 2.00;
   
   number = number - number;
   
   number = number + 9.00;
   
   number = number / 3.00;
   
   let quickMaths = (2.00 + 2.00) - 1.00;
   number = Math.pow(number, quickMaths);
   
   return number ;
}

function truth(isTrue) {
   if(isTrue == true) {
      return 
!truth(false );
   }

   else {
      return false ;
   }

}

function ultimateNumber(numeroMagica) {
   let numeroOriginale = numeroMagica ;
   numeroMagica = numeroMagica * 2.00;
   
   numeroMagica = numeroMagica * 5.00;
   
   numeroMagica = numeroMagica / numeroOriginale;
   
   return numeroMagica + 3.00;
}

function mutateNumber(number) {
   let backupNo = number ;
   while((number > 1.00) && (backupNo != 0.00)) {
      switch(number) {
         case 3.00:
            number = number * number;
            
            break;
         case 5.00:
            number = (number + 1.00) - number;
            
            break;
         case 9.00:
            number = number + 1.00;
            
            break;
         case 10.00:
            number = number / 2.00;
            
            break;
         default:
            number = 666.00;
            
            break;
      }

   }

   number = 
revampNumber();
   
   function revampNumber() {
      let refiner = 1.75;
      return refiner + (backupNo + number);
   }

}

function traverseArray(array) {
   for(var extractor in array) {
      alert(array [extractor ]);
   }

   for(var i = 0.00; i < array.length; i++) {
      alert(array [i ]);
   }

}

