/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coleman
 */
public class JUnitLoan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;
  
    // Constructor values.
    public JUnitLoan() {
      this(2.5, 1, 1000);
    }
  
    /** Constructs a loan with specified annual interest rate,
        number of years, and loan amount
      */
    public JUnitLoan(double annualInterestRate, int numberOfYears,
        double loanAmount) {
      this.annualInterestRate = annualInterestRate;
      this.numberOfYears = numberOfYears;
      this.loanAmount = loanAmount;
      loanDate = new java.util.Date();
    }
  
    // Returns the annualInterestRate.
    public double getAnnualInterestRate() {
      return annualInterestRate;
    }
  
    // Sets a new annualInterestRate.
    public void setAnnualInterestRate(double annualInterestRate) {
      this.annualInterestRate = annualInterestRate;
    }
  
    // Returns the numberOfYears.
    public int getNumberOfYears() {
      return numberOfYears;
    }
  
    // Set up the new numberOfYears.
    public void setNumberOfYears(int numberOfYears) {
      this.numberOfYears = numberOfYears;
    }
  
    // Returns the loanAmount.
    public double getLoanAmount() {
      return loanAmount;
    }
  
    // Set up a newloanAmount.
    public void setLoanAmount(double loanAmount) {
      this.loanAmount = loanAmount;
    }
  
    // Find monthly payment.
    public double getMonthlyPayment() {
      double monthlyInterestRate = annualInterestRate / 1200;
      double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
        (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
      return monthlyPayment;    
    }
  
    // Finds the total payment.
    public double getTotalPayment() {
      double totalPayment = getMonthlyPayment() * numberOfYears * 12;
      return totalPayment;    
    }
  
    // Returns the loan date. 
    public java.util.Date getLoanDate() {
      return loanDate;
    }
  }