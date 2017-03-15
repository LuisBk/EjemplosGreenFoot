import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pelota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelota extends Actor
{
    private int incx;
    private int incy;
    
    public Pelota()
    {
       incx=10;
       incy=10;
      
    }
    
    @Override
    public void act() 
    {
        //consulta las coordenadas actuales ordenadas de actor 
        int posx=this.getX();
        int posy=this.getY();
        //calcular nuevas coordenadas
        int nuevox=posx+incx;
        int nuevoy=posy+posy;
        
        World mundo=this.getWorld();
         if(nuevox>mundo.getWidth())
         {
            incx=-incx;
         }
         if(nuevoy>mundo.getHeight())
         {
            incy=-incy;
         }
         if(nuevox<0)
         {
            incx=-incx;
           
         }
         if(nuevox<0)
         {
            incx=-incx;
         }
        //cambiar de posicion a la pelota
        this.setLocation(nuevox, nuevoy);
    }    
}
