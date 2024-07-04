package codingNinjaOops;

public class Complex {
        private int real;
        private int imaginary;
        
        public Complex(int real, int imaginary){
            if(real == 0 && imaginary == 0){
                return;
            }
            this.real = real;
            this.imaginary = imaginary;
            
        }
        public void setReal(int rea){
            this.real = rea;
        }
        public void setImaginary(int ima){
            this.imaginary = ima;
        }
        public int getReal(){
            return real;
        }
        public int getImaginary(){
            return imaginary;
        }
        public void print(){
            if(real == 0 && imaginary == 0){
                return;
            }else{
                System.out.println(real + " + "+ imaginary + "i");
            }
        }

        public void add(Complex c2){
            this.real = this.real + c2.real;
            this.imaginary = this.imaginary + c2.imaginary;
            // print();

        }

//         public void multiply(Complex c2){
//             this.real = this.real*c2.real - this.imaginary*c2.imaginary;
//             this.imaginary =(this.imaginary*c2.real + this.real*c2.imaginary);
            
//         }

        public static Complex add(Complex c1, Complex c3){
            int rc = c1.real + c3.real;
            int ic = c1.imaginary + c3.imaginary;
            Complex c = new Complex(rc , ic);
            return c;
        }


        
}



