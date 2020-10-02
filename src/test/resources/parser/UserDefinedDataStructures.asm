.struct Person{firstName,lastName}
.var p1 = Person("Peter","Schmeichel")

.print p1.getStructName()        // Prints ‘Person’
.print p1.getNoOfFields()        // Prints ‘2’
.print p1.getFieldNames().get(0) // Prints ‘firstName’

.eval p1.set(0,"Kasper")         // Sets firstName to Kasper
.print p1.get("lastName")        // Prints “Schmeichel”


// Copy values from one struct to another
.var p2 = Person()
.for (var i=0; i<p1.getNoOfFields(); i++)
    .eval p2.set(i,p1.get(i))

// Print the content of a struct:
//   firstName = Casper
//   lastName = Schmeichel
.for (var i=0; i<p1.getNoOfFields(); i++) {
    .print p1.getFieldNames().get(i) + " = " + p1.get(i)
}