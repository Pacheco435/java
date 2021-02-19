package paquete1;
 class Clase1 {
   //public String atributoPublico =  "valor atributo publico";
     ///protected String atributoProtected = "Valor atributo protected";
  //// String atributoDefoult = "Valor atributo defoult";
     private String atributoPrivado = "Valor atributo privado";
   //public Clase1(){
    /// protected Clase1(){
     ////Clase1(){
       ////System.out.println("Constructor Default");
     private Clase1(){
         System.out.println("Constructor privado");
     ///public Clase1(String arg ){
        /// System.out.println("Constructor publico");
     }
     
     public Clase1(String argumento){
         this();
         System.out.println("Constructor publico");
     }
   
   //public void metodoPublico (){
     ///protected void metodoProtected(){
     ////void metodoDefault(){
     ////System.out.println("Metodo default");
     private void metodoPrivado (){
         System.out.println("Metodo privado");
   }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
     
}

