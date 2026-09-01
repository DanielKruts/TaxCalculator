# TaxCalculator
Tax Calculator for prepping my interview with the state revenue office of Indiana. All resources used that have to do with the knowledge and understanding of Indiana State Taxes resides in the Resources folder.

# How it is built
- Used the most recent install of JDK(26.0.2.1) to compile, run, develop, and debug code as I went. I also used the feature javadoc to generate documentation of the API.
- Indiana State taxes take into account withholding from both state and county tax at a flat rate with no brackets. I took the parsing in the pdf file from the departmental notice #1 document on the in.gov website and filtered through the county tax withholding rates from this past tax year

# What I learned
- The state of Indiana has a fixed taxable income rate of 2.95% as of 2026 and a county tax rate
- There are individual County Tax Rates that are withheld based on which one you reside in

# How to run
```Powershell
javac StateTaxCalcIN.java

java StateTaxCalcIN
```