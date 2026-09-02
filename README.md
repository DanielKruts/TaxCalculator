# TaxCalculator
Tax Calculator for prepping my interview with the state revenue office of Indiana. All resources used that have to do with the knowledge and understanding of Indiana State Taxes, as well as helpful resources for any users resides in the Resources folder. I am aware of the fact that there are many more aspects to calculating state taxes, however, given the limited amount of time I have to build the calculator, I decided to focus on building the program and unit tests for it.

# How it is built
- Used the most recent install of JDK(26.0.2.1) to compile, run, develop, and debug code as I went. I also used the feature javadoc to generate documentation of the API.
- Indiana State taxes take into account withholding from both state and county tax at a flat rate with no brackets. I used Claude to help parse through the file to give me an organized extraction of the county tax rates given the time I have to build it.

# What I learned
- The state of Indiana has a fixed taxable income rate of 2.95% as of 2026 and a county tax rate
- There are individual County Tax Rates that are withheld based on which one you reside in
- From being refreshed with Java syntax, I found that every class must have its own file, which makes things very interesting when you want to just make a helper structure to make things more organized and it just ends up being an additional file in your directory.

# Important Notes
- Attempted to do pdf extraction myself, but found that it would take more time than wanted for a small project such as this
- 

# How to run
```Powershell
javac StateTaxCalcIN.java

java StateTaxCalcIN
```
- Make sure you have calculated your total deductables and exemptions using the Schedule 2 and Schedule 3 documents in the Resources directory and follow the prompts after running the program