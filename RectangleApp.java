// An application to create and manipulate rectangles
public class RectangleApp {
	//To be excutable, need a main method
	public static void main( String[] args) {
		System.out.println("Creating myRect1");
		
		Rectangle myRect1; //myRect is not instantiated
		myRect1 = new Rectangle(20.0, 8.0,30,30); //instantiated
		
		//static field
		System.out.println("Rectangle has " + Rectangle.NUMBER_OF_SIDES + " sides");
		//instance fields
		System.out.println("Width: "+myRect1.getwidth()+", Height: "+myRect1.getheight());
		System.out.println("Origin is: "+myRect1.getoriginX()+","+myRect1.getoriginY());
		//calling methods
		System.out.println("Area: "+myRect1.getArea());
		
		System.out.println("\nMoving myRect1");
		myRect1.move(0,10);//the object's state is changed
		System.out.println("Origin is: "+myRect1.getoriginX()+","+myRect1.getoriginY());

		System.out.println("Changing width of myRect1");
		myRect1.setwidth(16);//the object's state is changed
		System.out.println("Width: "+myRect1.getwidth()+", Height: "+myRect1.getheight());

		
		System.out.println("Creating myRect2");
		Rectangle myRect2 = new Rectangle(20.0, 8.0);
		System.out.println("Width: "+myRect2.getwidth()+", Height: "+myRect2.getheight());
		System.out.println("Origin: "+myRect2.getoriginX()+","+myRect2.getoriginY());
		


		
		System.out.println("Creating myRect3");
		Rectangle myRect3 = new Rectangle(); 
		System.out.println("Width: "+myRect3.getwidth()+", Height: "+myRect3.getheight());
		System.out.println("Origin: "+myRect3.getoriginX()+","+myRect3.getoriginY());
		

		myRect1.scale(0.5); // applies 0.5 scale to both x and y, changing width to 8, height to 4

 		myRect2.scale(1,3); // should change height to 24 with width unchanged

 		myRect3.scale(15,10); // should scale to width 15, height 10
		System.out.println("Rect1");
		System.out.println("Width: "+myRect1.getwidth()+", Height: "+myRect1.getheight());
		System.out.println("Rect2");
		System.out.println("Width: "+myRect2.getwidth()+", Height: "+myRect2.getheight());
		System.out.println("Rect3");
		System.out.println("Width: "+myRect3.getwidth()+", Height: "+myRect3.getheight());
		
		Rectangle myRect4 = new Rectangle(30.0, 5.0, 10, 10); 
		Rectangle myRect5 = new Rectangle(50.0, 20.0, 0, 0); 
		Rectangle myRect6 = new Rectangle(20.0, 40.0, 500, 500); 

		// myRect4 overlaps myRect5 so these should show as true
		System.out.println( "myRect4 overlaps myRect5: " + myRect4.isOverlappedWith(myRect5) ) ; 
		System.out.println( "myRect5 overlaps myRect4: " + myRect5.isOverlappedWith(myRect4) ) ;

		// myRect4 does not overlap myRect6 so these should show as false
		System.out.println( "myRect4 overlaps myRect6: " + myRect4.isOverlappedWith(myRect6) ) ;
		System.out.println( "myRect6 overlaps myRect4: " + myRect6.isOverlappedWith(myRect4) ) ;

		boolean result = Rectangle.areOverlapping(myRect4, myRect5);
		System.out.println( "myRect4 overlaps myRect5: "+result);


		Rectangle r1 = new Rectangle(10, 10);
		Rectangle r2 = new Rectangle(10, 12);

		System.out.println("r1 is square? " + r1.isSquare());
		System.out.println("r2 is square? " + r2.isSquare());


		System.out.println("Check class prevents negative widths");

		// initialise rectangle for test
		Rectangle myRect7 = new Rectangle(30.0, 5.0, 10, 10); 
		System.out.println( "Width: "+myRect7.getwidth()+", Height: "+myRect7.getheight() );

		// change to positive width should be allowed
		myRect7.setwidth(40);
		System.out.println( "Width: "+myRect7.getwidth()+", Height: "+myRect7.getheight() );

		// change to negative width should be ignored
		myRect7.setwidth(-10);  // prints warning, width does NOT change
		System.out.println("Width: " + myRect7.getwidth() + ", Height: " + myRect7.getheight());

		Rectangle r8 = new Rectangle(10.0,5.0);  // have change the name to r8 and r9 because the code cannot run
		Rectangle r9 = new Rectangle(10.0,5.0); 
		Rectangle r3 = r9;

		System.out.println("Object reference tests:");
		System.out.println("r1: " + r8);
		System.out.println("r2: " + r9);
		System.out.println("r3: " + r3);
		
		r8.scale(0.5);
		System.out.println("r2 width: " + r9.getwidth());
		System.out.println("r3 width: " + r3.getwidth());



	}
}
