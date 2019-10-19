void setup(){
 size(1000,500); 
}

void draw(){
  
 rings(250, 250); 
 rings(750, 250);
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
