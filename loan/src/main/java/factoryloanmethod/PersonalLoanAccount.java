/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryloanmethod;

/**
 *
 * @author HP
 */
public class PersonalLoanAccount implements LoanAccount
{
    double amt,ri;
    int ny;
    
    public PersonalLoanAccount()
    {
        amt=0;
        ri=0;
        ny=0;
    }
    
    public double getInterest()
    {
        return (ny*ri*amt)/100;
    }
   
    public void setRateofInt(double r)
    {
            this.ri=r;
    }
    
    public void setLoanAccount(double lamt)
    {
        this.amt=lamt;
    }
    
    public void setNoofYear(int n)
    {
        this.ny=n;
    }
    
    public String TermCond()
    {
        return "Minimum amonut for PersonalLoanAccount Is 50000 ans Maximum amount is 500000" ;
    }
}
