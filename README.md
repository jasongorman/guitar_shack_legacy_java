# guitar_shack_legacy_java
"Legacy code" version of the Guitar Shack implementation for folk to practice on

I refuctored my Java solution for the Guitar Shack exercise into a Big Ball of Mud with hardwired external dependencies that make unit testing currently impossible.

There are, of course, no automated tests. But there's a Program.main() method you can run with 2 arguments to process a sale: product ID (int) and quantity sold (int).

The program will check stock and sales data from two AWS web services to decide if an alert needs to be sent to reorder new stock.

The Guitar Shack owner wants to change the logic of how we calculate the reorder level for a product. Currently it uses the rate of sales during the previous 30 days.

It must now calculate the rate of sales during the NEXT 30 days, but in the /previous/ year. e.g., if today's date is Dec 24th 2020, the rate of sales will be calculated for sales of that product which happened during Dec 25th 2019 - Jan 24th 2020. 

To make this change safely, you're going to need to add fast-running tests. To add fast-running tests you're going to have to separate some of the concerns in the Big Ball of Mud.

Once you've got some fast-running tests around it, make the change the customer requested. Then, while you're in there, apply the "Boy Scout Rule" and clean up the code a bit more to make life easier for the next person who has to work on it.

Happy refactoring!


