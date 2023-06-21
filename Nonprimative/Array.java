package Nonprimative;
/*
 * เก็บกลุ่มข้อมูล
 * ข้อมูลในอาร์เรย์เรียนกว่า element (0,1,2,...n)
 * element จะเก็บ value & index
 * ข้อจำกัดคือต้องเก็บข้อมูลแบบเดียวกัน มีขนาดที่แน่นอน
 */
    public class Array{
        public static void main(String[] args) {
            //การประกาศ arr 
            //ชนิดข้อมูล [] ชื่อตัวแปร = new ชนิดข้อมูล [ขนาด];
            //หรือ ชนิดข้อมูล [] ชื่อตัวแปร = {สมาชิก}
            String[]pets={"Cat","Dog","Hamster"};
            System.out.println("pets[0] : "+ pets[0]);
            //เปลียนค่า
            System.out.println("pets[2] : "+ pets[2]);
            pets[2]="Turtle";
            System.out.println("pets[2] : "+ pets[2]);
            //---------------------------

            int[]arr=new int[4];//แบบกำหนดขนาด
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 4;
            arr[3] = 69;
            System.out.println("position : "+ arr[3]);

            //Array length;
            int[]number={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
            boolean[] status ={true,false,false,true};
            // int size = number.length;
            System.out.println(number.length);
        }
    }