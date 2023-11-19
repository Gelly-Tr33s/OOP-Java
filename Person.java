/*

  Class is a blueprint of an object

    - properties/attributes
    
    - methods/actions


  Access modifiers (scope)
  ------------------------
  public    - accessible anywhere
  <default> - accessible from within the package
  private   - accessible from within the class
  protected - 

  Encapsulation - one of the pillars in OOP which means hiding the
                    complexities of certain properties and methods inside a class

*/

public class Person {

    /*
    public String strLast;    // property Lastname 
    public String strFirst;   // property Firstname
    public String strMiddle;  // property Middlename 
    */

    private String strLast;    // property Lastname 
    private String strFirst;   // property Firstname
    private String strMiddle;  // property Middlename 

    // methods below

    // mutators and accessors (setters and getters)

    /*
      a constructor is a special method that executes automatically when
        an object is instantiated
    */

    public Person() {

    }  // public Person()

    public Person(String tstrLast, String tstrFirst, String tstrMiddle) {

        this.strFirst = tstrFirst;
        this.strMiddle = tstrMiddle;
        this.strLast = tstrLast;

    }  // public Person(String tstrLast, String tstrFirst, String tstrMiddle)

    public void setLast(String tstrLast) {

        this.strLast = tstrLast;

    }  // public void setLast(String tstrLast) 

    public void setFirst(String tstrFirst) {

        this.strFirst = tstrFirst;

    }  // public void setFirst(String tstrFirst) 

    public void setMiddle(String tstrMiddle) {

        this.strMiddle = tstrMiddle;

    }  // public void setMiddle(String tstrMiddle)

    
    public String getLast() {

        return this.strLast;

    }  // public String getLast()

    public String getFirst() {

        return this.strFirst;

    }  // public String getFirst()
  
    public String getMiddle() {

        return this.strMiddle;

    }  // public String getMiddle()

    public String getInfo() {
        return this.strFirst + " " + this.strMiddle + " " + this.strLast;
    }

    
    public String getFullName() {

        return this.strFirst + " " +
               this.strMiddle + " " +
               this.strLast; 

    }  // public String getFullName()    

}  // public class Person