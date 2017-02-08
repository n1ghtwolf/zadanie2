package zadanie2;



class Reisy {
 
    //public int id;
    public String type;
    public double reys;
    public double cost;
    public double passagers;
    public double AverageCost;
    
 
    public Reisy() 
    {
    }
    
         public Reisy(String type,double reys,double cost,double passagers) 
         {
        //this.id = id;
        this.type = type;
        this.reys = reys;
        this.cost = cost;
        this.passagers = passagers;
        //this.AverageCost = AverageCost;
      }
         
 /*public String id() {
        return id;
    }*/
 public String type() {
        return type;
    }
 public double reys() {
        return reys;
    }
 public double cost() {
        return cost;
    }
 public double passagers() {
        return passagers;
    }
 public double AverageCost() {
        return AverageCost;
    }
   
        
    }
    
 
   