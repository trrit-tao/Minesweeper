class Person {

}
interface Car {

   default String drive() {

   }
}
class HachBack {

}
class Bus implements Car {

   @Override
   public String drive() {
       Car car = new Car() {
          @Override
          public String drive() {
             return null;
          }
       };
      return null;

   }
}
