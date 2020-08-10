package Encapsulation;
/*
Instructions from your teacher:
In  Db class we have two attributes/instance variables with the private visibility.
meaning they cannot be accessed outside of the class.

Instance variables:
   1) name: data -
       type: String
       Visibility/Access modifier: private
   2) name: yint -
       type: int
       Visibility/Access modifier: private

Methods:
    - insertData - lets you set the values to above encapsulated instance variables.
    - getData - getter method for private data
    - getYint - getter method for private yint
    - setData - setter method for private data
    - setYint - setter method for private yint

for example:
 Db db = new Db();
 db.insertData("aaa",123);

 System.out.println(db.getData());//aaa
 System.out.println(db.getYint());//123

 db.setData("zzz");
 db.setYint(200);

 System.out.println(db.getData());//zzz
 System.out.println(db.getYint());//200
 */
public class getter_setter_Encapsulation02 {
    public static void main(String[] args) {

        Db db = new Db();
        db.insertData("aaa",123);


        System.out.println(db.getData());//aaa
        System.out.println(db.getYint());//123

        db.setData("zzz");
        db.setYint(200);

        System.out.println(db.getData());//zzz
        System.out.println(db.getYint());//200

    }

    static class Db {//replit de bu static degil
/*
Instance variables:
   1) name: data -
       type: String
       Visibility/Access modifier: private
   2) name: yint -
       type: int
       Visibility/Access modifier: private
 */
        private String data;
        private int yint;
        /*
        Methods:
    - insertData - lets you set the values to above encapsulated instance variables.
    - getData - getter method for private data
    - getYint - getter method for private yint
    - setData - setter method for private data
    - setYint - setter method for private yint
         */
        public void insertData(String data,int yint){
            this.data=data;
            this.yint=yint;
        }
        public String getData(){
            return data;
        }
        public int getYint(){
            return yint;
        }
        public void setData(String data){
            this.data=data;
        }
        public void setYint(int yint){
            this.yint=yint;
        }
    }



}
