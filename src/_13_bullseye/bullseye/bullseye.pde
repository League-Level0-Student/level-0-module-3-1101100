int x = 400;
int y = 400;


void setup(){
    size(500, 500);
      for (int i = 0; i < 8; i++){
    
    if (i % 2 == 0) {
         x = x - 50;
         y = y - 50;
         fill (255, 0, 0);
         ellipse (250, 250, x, y);
    }
    else {
         y = y - 50;
          x = x - 50;
          fill (0, 0, 0);
         ellipse (250, 250, x, y);
    }

  }

}
