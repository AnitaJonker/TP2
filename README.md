This is the description of my domain model.


There are three packages. All three are seperate from one another. Worker, Member , Book.

The concrete Worker class has all the details of the workers. 
An interface WorkerFactory is created that states the method getWorker will be returning an object of type Worker. 
A class UseWorkerFactory implements the WorkerFactory interface and it receives a command from the user of what type of worker's details are they looking for and sets up the chain of responsiblities to go through all the workers.So in testing the user can get any specific detail of the workers they want.
An interface RegisterWorker is created that states the method registerWorker() will be returning an object of type Worker.
One abstract superclass WorkerDetails contains the two functions needed to go through the chain of responsibilties created in UseWorkerFactory.
Three subclasses RegisterLibrarian , RegisterCleaner and RegisterSecurity are extending the superclass and also implementing the interface.


The concrete Books class has all the details of the books in the library. 
An interface BookFactory is created that states the method getBook will be returning an object of type Books. 
A class UseBookFactory implements the BookFactory interface and it receives a command from the user of what type of book they are looking for and sets up the chain of responsiblities to go through all the types of books. So in testing the user can get any specific detail(name,author,pages) of any type of book they want.
An interface RegisterBook is created that states the method registerBook() will be returning an object of type Books.
One abstract superclass BookDetails contains the two functions needed to go through the chain of responsibilties created in UseBookFactory.
Five subclasses NonFiction , Kid, AdultBook, Restricted, YoungAdult, RegisterCleaner and RegisterSecurity are extending the superclass BookDetails and are also implementing the interface RegisterBook.

The concrete MemberDetails class has all the detail of library members.
An interface RegisterMember is created that states the method registerMember will be returning an object of type MemberDetails.
The class Member implements the interface RegisterMember

