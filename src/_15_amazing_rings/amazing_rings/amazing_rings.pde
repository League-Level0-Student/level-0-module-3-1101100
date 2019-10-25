int a = 250;
int b = 750;

int toggle = 1;
void setup(){
 size(1000,500); 
}

void draw(){
  if (a < 1000 && b > 0 && toggle == 1){
  a = a + 1;
  b = b - 1;
  }
  if (a == 1000 && b == 0){
    toggle = 0;
  }
  if (a > 0 && b < 1000 && toggle == 0){
    a--;
    b++;
  }
   if (a == 0 && b == 1000 && toggle == 0 ){
     toggle = 1;
   }
  
  background(255,255,255);
 rings(a, 250); 
 rings(b, 250);
} 


void rings(int x, int y){
int w = 200;
int h = 200;
    for (int i = 0; i < 50; i++){
    if (i % 2 == 0) {
         w = w - 10;
         h = h - 10;
         noFill();
         ellipse (x, y, w, h);
    }
    else {
         h = h - 10;
          w = w - 10;
          noFill();
         ellipse (x, y, w, h);
    }
  }
}
