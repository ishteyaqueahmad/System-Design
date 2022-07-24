# System-Design

## IndianPolitics: politics use case.


MPS:

getConstituency - return their winning constituency.
getDriver - returns the driver assigned for their vehicle (default car).
exceedsSpendingLimit - returns true or false if Mps exceeds to their spending limit.

PM->Ministers->MPS (All of them are MPS) - PM has special permissions such as it can give permission to arrest any minister.

PM enjoys special benefits such as Aircraft (along with car) and its designated driver. 

Note: PM spending limit : 1 crore, Ministers: 10 lakhs, MPS: 1 lakh.

Need to design in a way  where Commisioner class can arrest MPS, Ministers and PM when their expense exceeds their spending limit:
canArrest - can arrest one or many MPS.  
           Note: If PM  cant arrest.
                 If minister can arrest with PM permission
                 if mps they can be arrested without anyones permission.     
In Short, If the MP is not PM then he can be arrested by commisoner , If he is minister then can be arrested with PMs permisison.
