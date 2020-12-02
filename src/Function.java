public class Function {
    static boolean myFunction() {  //Question 1
        return true;
    }

    static String myFunction1(String str) {         //Question 2

        return str;
    }           //Question 2
    static void myFunction2(String str1,String str2) {   //Question 3
        System.out.println(str1+str2);
    }       //Question 3


    static String myFunction3(int nbr1,int nbr2) {   //Question 4
       if(nbr1>nbr2) {
           return "Le premier nombre est plus grand ";
       }
       else if(nbr2>nbr1){
           return "Le premier nombre est plus petit ";
       }
       else return "Les deux nombres sont identiques ";
    }

    public static void myFunction4(String str,int nbr){   //Question 5

        System.out.println(str+nbr);
    }

    public static void myFunction5(String str1,String str2,int nbr){            //Question 6
        System.out.println("Bonjour "+str1+str2+", tu as "+nbr+" ans");
    }
    public static void myFunction6(int age,String genre){                           //Question 7
      if(age<18 && genre=="homme" ||genre=="femme"){
          System.out.println("Vous êtes un "+genre+" et vous êtes mineure");

      }
      else if(age>=18 && genre=="femme" || genre=="homme"){
            System.out.println("Vous êtes un "+genre+" et vous êtes majeur");

        }

    }
    static int myFunction7 (int Par1, int Par2, int Par3){          //Question 7
        return (Par1 + Par2 + Par3);

    }
    static int myFunction7 (int Par1, int Par2){
        return myFunction7( Par1, Par2, 5);
    }
    static int myFunction7 (int Par1){
        return myFunction7( Par1, 3);
    }
    static int myFunction7 (){
        return myFunction7( 2);
    }





        public static void main(String[] args) {
        myFunction();
        myFunction1("Hello Guys ");
        myFunction2("Hello Guys ","my name is Hassan");
        myFunction3(3 ,5);
        myFunction4("Hey Hassan " ,10);
        myFunction5("Hassan ","Hmiyed ",24);
        myFunction6(24,"homme");
        myFunction6(16,"femme");
        myFunction7(5,7,8);
    }
}


