


function init(){
      canvas=document.getElementById("mycanvas");
      W=H=canvas.width=canvas.height=1000;
      pen=canvas.getContext('2d');
      cs=66;
      gameover=false;
      food_img=new Image();
      food_img.src="Assets/apple.png";

      trophy_img=new Image();
      trophy_img.src="Assets/trophy.png";
      food=foodItem();
      score= score();

      snake={
          init_length :5,
          color:"blue",
          cells:[],
          direction:"right",
          createsnake:function(){
              for(var i=this.init_length;i>0;i--){
                  this.cells.push({x:i,y:0})
              }
          },
          drawsnake: function(){
              for(var i=0;i<this.cells.length;i++){
                pen.fillStyle=this.color;
                pen.fillRect(this.cells[i].x*cs,this.cells[i].y*cs,cs-2,cs-2);
                
                pen.drawImage(food_img,food.x*cs,food.y*cs,cs,cs);

               
                pen.drawImage(trophy_img,score.x,score.y+50,100,50);
                pen.fillStyle="white";
                pen.font="25px Arial"
                pen.fillText(score.score,score.x+40,score.y+70);
            

              }

 
 
          
              },
          updatesnake :function(){
     
            var HeadX= this.cells[0].x;
            var HeadY= this.cells[0].y;
            if(food.x==HeadX&&food.y==HeadY){
                food =foodItem();
                score.score+=1;
            }
            else{
                 this.cells.pop();
            }
            if(this.direction=="right"){
                var X=HeadX+1;
                var Y=HeadY;
            }
            else  if(this.direction=="left"){
                var X=HeadX-1;
                var Y=HeadY;
            }
            else  if(this.direction=="up"){
                var X=HeadX;
                var Y=HeadY-1;
            }
            else{
                var X=HeadX;
                var Y=HeadY+1;
            }
            if(X*cs>W-cs||X<0||Y*cs>W-cs||Y<0){
              gameover=true;
            }
            
            this.cells.unshift({x:X,y:Y})

          }
      }
      function keypressed(e){

        if(e.key=="ArrowUp"){
            snake.direction="up";
        }
        else if(e.key=="ArrowDown"){
            snake.direction="down";
        }
        else if(e.key=="ArrowRight"){
            snake.direction="right";
        }
        else {
            snake.direction="left";
        }
      }

      document.addEventListener('keydown',keypressed);
      snake.createsnake();

     

}

function foodItem(){
    var foodx=Math.round(Math.random()*(W-cs)/cs);
    var foody=Math.round(Math.random()*(W-cs)/cs);
    var food ={
        x:foodx,
        y:foody,
        color:"red"
    }
    return food;
}

function score(){
    
    scores={
        x:25,
        y:0,
        score:0,
    }
    return scores;
}

function draw(){
    pen.clearRect(0,0,W,H);
    snake.drawsnake();

}
function update(){
    snake.updatesnake();
       
    // rect.y+=rect.speed;
    // if(rect.x>canvas.width-rect.w||rect.x<0){
    //     rect.speed*=-1;
    // }

}
function gameloop(){
    if(gameover){
        clearInterval(f)
        alert('game-over');
    }
    draw();
    
    update();

}
init();
 f=setInterval(gameloop,100);

