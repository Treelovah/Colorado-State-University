public class  Encyclopedia extends Book {
   // TODO: Declare private fields: edition, numVolumes
   private String edition = "";
   private int numVolumes = 0;

   // TODO: Define mutator methods - ** mutator is just a fancy erm for "setter" methods.
   //       setEdition(), setNumVolumes()
   public void setEdition(String edition) {
       this.edition = edition;
   }
   
   public void setNumVolumes(int numVolumes) {
       this.numVolumes = numVolumes;
   }
  
   // TODO: Define accessor methods - ** accessor is just a fancy term for "getter" methods.
   //       getEdition(), getNumVolumes()
   public String getEdition() {
       return this.edition;
   }

   public int getNumVolumes() {
       return this.numVolumes;
   }
   // TODO: Define a printInfo() method that overrides 
   //       the printInfo in Book class 
   @Override
   public void printInfo() {
       super.printInfo();
       System.out.printf("   Edition: %s\n",getEdition());
       System.out.printf("   Number of Volumes: %d\n",getNumVolumes());
   }
}