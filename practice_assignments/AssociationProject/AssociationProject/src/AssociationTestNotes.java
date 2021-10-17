/*

				Association
					|
		------------------------------------------------
		|		|					|			|
		isA		hasA			usesA		producesA
		|			|				|			|
		Phone	WashingMachine	Cashier			AccountStatement withdraw(amt)
		|			WashingTub		dispense(SavingsAccount ref)
	SmartPhone

	BankAccount
	|
	SavingsAccount
		List<AccountStatment>
		
	
OOPS
----
1. Abstraction
			it is the "what is?" part of an object
			
			hides the complexity of an object
			and provides the simple USAGE of an object via accessible functions
			
			 what is an ATM? - get a cash
			 what is a mobile phone?
			 
	a. data abstraction - no need to know the total cash in atm
	b. procedural abstraction - dipTheCard/swipeCard -> generateLog()->askPin()
	c. class abstraction - inner private classes - internal housekeeping in an object way 
	
2. Encapsulation <-- ATM Engineer
			it is the "how is it?" part of an object
			
			binding the data with contractual functions - 
			contract of a class = association of data members with concerned functions
			

3. Polymorphism
				ability of a "business entity" to have multiple forms
				
				a. class extension
								BankAccount
										|
						----------------------------------
						|
					SavingsAccount
					
					
									Medical
									| oath(); //mandate on Doctor
									|
									Doctor
									| diagnose() { } //exclusive
									| oath() { } // mandate here 
									|
							----------------
							|
						Surgeon
						| doSurgey() { 
						|	super.diagnose();	inherited
						| } // exclusive
						|
					-----------
					|
				HeartSurgeon
					|  doHeartSurgery() { }
					|  diagnose() {  overrirding
					|  }
					
					
				b. early binding vs late binding
					
					
						function overloading	vs 		function overriding
						|								|
						early binding					spanned across the hierarchy of the classes
				SmartPhone sp = new SmartPhone();
				sp.dial();
				
				sp.dial(10); // count of para is 1
				sp.dial(10.4); // count of para is 1
				
				sp.dial("Julia");
				sp.dial("Julia","Jane"); // types are same, count is diff
				
				sp.dial("Julia",123); //types and count is same
				sp.dial(223,"Julia"); //but sequence is diff
				
				
				
					
					1. type of arguments
					2. number of parameters
					3. sequence of parameters		
				
	
	The Java Programming Language - James Gosling, Ken Arnold 

4. Inheritance

		ability of a business entity to acquire properties 
		from existing entities
		
		1. exclusive method
		2. inherited method
		3. inherited-overriding method
		4. implemented method
		
		
				Derivation		vs			Implementation
				|							|
			regular classes				abstract classes/interfaces
		
		
			1. single
			2. multi
			
			3. multiple level - non linear *interfaces 
			
			
					PetrolEngine	CNGEngine	ElectricalEngine
					|				|			|
					--------------------------------
									|
								HybridEngine
								
								 giveBirth()
								  |
					Bird		Mammal		Fish
					|fly()		|	|		|swim()
					|layEggs()	|	|		|layEggsInSpawningGround() { }
				    ------------	---------	|
					|		|			|		|
					Sparrow Bat			Whale  Sword
							
							
							
							
							
							
							
							
							
							
			4. hierarchical
			
		
		
		product + services
		|				|
		Car				servicing()
		|				painting()
		tangible		repairing()
						washing()
						cleaning()
						
		
		BankAccount <-- abstract 
				| acno|name|balance
				|
				| withdraw();  
				| deposit(); <-- mandates
			------------------------------------------------------------
			|				|				|				|	  |
		SavingsAccount	CurrentAccount	CreditAccount	CarLoan PlotAndConstructionLoan
		|rate			odlimit			cash|creditlimit
	----------------------
	|					|
FixedDepositAccount	RecurringDepositAccount
maturityPeriod			recurringAmount


Vishal invest 1 gold every month | 1 gm| 3000/4000







			SavingsAccountService
					|
				-------------
				|
		withdrawService()
		
		
	1. layer1		database layer
	2. pojo			java classes to hold the data mapped with tables
	3. repository	DAO | DATA access layer 
	4. service 		business logic of your project
	5. controller	RestController | REST service | spring REST
	
	6. UI / angular/ jsp / js / ajax	
	
		http://ip:port/mybank/getBalance/101
		
		
		
		

5. Object communication

	invocation of a method 
	
	class Cashier
	{
		void dispenseCash(SavingsAccount ref, double amountToWithdraw)
		{
				ref.withdraw(amountToWithdraw);
		}
	}
	
	class SavingsAccount
	{
		void withdraw() {
		
		}
	}

*/











