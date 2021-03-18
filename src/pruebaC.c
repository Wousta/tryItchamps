//
// Created by luisb on 18/03/2021.
//
//prueba de C

#include <stdio.h>

int main() {
    int h,w, area;
    int in = 0;
    scanf("%d %d",&h,&w);
    char pos;
    char poly[h][w];
    for(int i = 0; i < h; i++){
        for(int j = 0; i < w; j++){
            scanf("%c",&pos);
            if(!in && pos != '.'){
                in = 1;
                area += 1;
            }
            else if(in && pos != '.'){
                in = 0;
                area += 1;
            }
            else { area += 2;}
        }
    }
    printf("%d",area);
    return 0;
}
