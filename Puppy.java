public class Puppy{
   
   static int puppyAge;

   public Puppy(String name){
      System.out.println("Name " + name ); 
   }
   public void setAge( int age ){
       puppyAge = age;
   }

   public int getAge( ){
       System.out.println("Age " + puppyAge ); 
       return puppyAge;
   }
   public static void main(String []args){
      Puppy myPuppy = new Puppy( "Joe" );

      myPuppy.setAge( 2 );

      myPuppy.getAge( );
      
      if(puppyAge <= 2) {
      System.out.println("This is a puppy, because it is small");
      };
      System.out.println("ID " + myPuppy.puppyAge ); 
   }
}