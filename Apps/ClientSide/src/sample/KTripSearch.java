package sample; /***********************************************************************
 * Module:  KTripSearch.java
 * Author:  Korisnik
 * Purpose: Defines the Class KTripSearch
 ***********************************************************************/

import java.util.*;

/** @pdOid e2648e64-5433-4854-bf74-50ca967afeaf */
public class KTripSearch {
   /** @pdRoleInfo migr=no name=NavigationEngine assc=association4 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection navigationEngine;
   
   /** @pdOid 5b3b6b65-c681-4150-b031-d77f33b4fe4d */
   public int vrniSeznamVozenj() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid d0ede947-e873-447e-b464-0ffc47e08e7e */
   public int vrniPodrobnostiVoznje() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 7a36df12-24ff-40e9-900c-c581ba4a1339 */
   public int postaviCeno() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid dfa46cd5-2e98-42c2-af52-8290e1556c84 */
   public int vrniOdgovorNaZahtevo() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 5fecae60-f74b-4b60-b057-f0cecfffdf7a */
   public int posodobiPodrobnostiVoznje() {
      // TODO: implement
      return 0;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection getNavigationEngine() {
      if (navigationEngine == null)
         navigationEngine = new java.util.HashSet();
      return navigationEngine;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorNavigationEngine() {
      if (navigationEngine == null)
         navigationEngine = new java.util.HashSet();
      return navigationEngine.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newNavigationEngine */
   public void setNavigationEngine(java.util.Collection newNavigationEngine) {
      removeAllNavigationEngine();
      for (java.util.Iterator iter = newNavigationEngine.iterator(); iter.hasNext();)
         addNavigationEngine((NavigationEngine)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newNavigationEngine */
   public void addNavigationEngine(NavigationEngine newNavigationEngine) {
      if (newNavigationEngine == null)
         return;
      if (this.navigationEngine == null)
         this.navigationEngine = new java.util.HashSet();
      if (!this.navigationEngine.contains(newNavigationEngine))
         this.navigationEngine.add(newNavigationEngine);
   }
   
   /** @pdGenerated default remove
     * @param oldNavigationEngine */
   public void removeNavigationEngine(NavigationEngine oldNavigationEngine) {
      if (oldNavigationEngine == null)
         return;
      if (this.navigationEngine != null)
         if (this.navigationEngine.contains(oldNavigationEngine))
            this.navigationEngine.remove(oldNavigationEngine);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllNavigationEngine() {
      if (navigationEngine != null)
         navigationEngine.clear();
   }

}