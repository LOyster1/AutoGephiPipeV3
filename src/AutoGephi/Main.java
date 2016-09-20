

/**
 *
 * @author motion411
 */
package AutoGephi;

public class Main 
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        //if(args.length>0)
        //{   
        AutoGephiPipeV3.initialize();
            for(int i=0; i<=args.length-1;i++)
            {
                
                AutoGephiPipeV3.importGraph(args[i]);
                
            }
            
        AutoGephiPipeV3.sizeNodes();
        AutoGephiPipeV3.colorByCommunity();
        AutoGephiPipeV3.radialAxLayout();
        AutoGephiPipeV3.exportGraph();
            
       /* }
        else{
            System.out.println("Error, no graph files to import");
        }
        */
        
        //AutoGephiPipeV3.importGraph("Company-to-Company4.gdf");
        //AutoGephiPipeV3.importGraph("Y:\\Documents\\NetBeansProjects\\AutoGephiPipeV3\\src\\AutoGephi\\Company-to-Company4.gdf");
       
        
        // TODO code application logic here
    }
    
}
