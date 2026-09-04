# TaxCalculator
Tax Calculator for prepping my interview with the state revenue office of Indiana. All resources used that have to do with the knowledge and understanding of Indiana State Taxes, as well as helpful resources for any users resides in the Resources folder. The focus is to have a built a calculator that computes the amount of tax withholding in an employee's paychecks given certain parameters and run a small test suite to improve my knowledge and understanding of JDK and the Java language as a whole. 

# How it is built
- Used the most recent install of JDK(26.0.2.1) to compile, run, develop, and debug code as I went. I also used the feature javadoc to generate documentation of each component of my code.
- Indiana State taxes take into account withholding from both state and county tax at a flat rate with no brackets. I used Claude to help parse through the pdf file, "How to Compute Withholding for State and County Income Tax, to give me an organized extraction of the county tax rates given the time I have to build it.

# What I learned
- The state of Indiana has a fixed taxable income rate of 2.95% as of 2026. Indiana is only 1 of 15 states that have a fixed or flat taxable income rate.
- There are individual County Tax Rates that are withheld based on which one you reside in
- From being refreshed with Java syntax, I found that every class must have its own file, which makes things very interesting when you want to just make a helper structure to make things more organized and it just ends up being an additional file in your directory.
- The Java compiler, javac, helps a lot with small and large projects when it comes to compiling code. Every file will check the directory it resides in for classes and methods in other files at compile time. A decent bit different from C++, where including all of the files you are compiling is crucial in your compilation.
- I better understand the importance of proper documentation and that JDK makes this simple by giving you the option to use `/** */` instead of the normal `/* */` for multi line commenting. This will allow you to use javadoc in the command line to produce real documentation.

# Important Notes
- Attempted to do pdf extraction myself, but found that it would take more time than I had for a small project such as this
- The calculator has a few rounding off issues and is not exactly pinpoint perfect, but for the scope of the project, it works very well for what I wanted to do
- Although the project is small, the hope is to take away a knowledge and understanding of the development process at a different angle, where the focus is more on the research and documentation process of software development.

# How to run
```Powershell
javac StateTaxCalcIN.java

java StateTaxCalcIN
```

# Documentation
```Powershell
javadoc -d docs *.java
```
- This creates a new folder named docs, or whatever you name it, in the working directory, and includes all documentation from the javadocs comments that are in all of the .java files
- The documentation is not entirely complete, this was the first time I have used Javadocs and look to improve in the future.