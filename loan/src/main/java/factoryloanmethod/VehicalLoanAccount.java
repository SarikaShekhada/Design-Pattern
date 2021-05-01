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
public class VehicalLoanAccount implements LoanAccount
{
    double ri,amt;
    int ny;
    
    public VehicalLoanAccount()
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
    
    public void setLoanAmount(double lamt)
    {
        this.amt=lamt;
    }
    
    public void setNoofYear(int n)
    {
        this.ny=n;
    }
    
    public String TermCond()
    {
        return "Minimum amonut for VehicalLoanAccount Is 50000 ans Maximum amount is 500000" ;
    }
}
