package sample; /***********************************************************************
 * Module:  NavigationEngine.java
 * Author:  Korisnik
 * Purpose: Defines the Class NavigationEngine
 ***********************************************************************/

import java.util.*;

/** @pdOid 53717535-4fea-44c0-b604-1e71a3b644a8 */
public class NavigationEngine {
   /** @pdRoleInfo migr=no name=Voznik assc=association6 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection voznik;
   /** @pdRoleInfo migr=no name=Trip assc=association8 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection trip;
   
   /** @pdOid 3dcb74ca-ac95-468a-9a69-e4fdeb18647b */
   public int aktivirajVoznjo() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid ea996cd5-f5a2-4fa9-9f2f-22c35dd0695a */
   public int posodobiVoznjo() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 0a810b11-f6ac-4a80-adfb-07ab25512b05 */
   public int vrniPodrobnostiVoznje() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 2ba4e072-7e26-4224-b7c7-774a73b5818d */
   public int vrniOdgovorZahteve() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 591863ea-1f11-4863-80b2-e40f32668f45 */
   public int vrniPosodobljenePodrobnosti() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid dd3050ca-2b44-4938-b421-992cd8493c41 */
   public int vrniSeznamVozenj() {
      // TODO: implement
      return 0;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection getVoznik() {
      if (voznik == null)
         voznik = new java.util.HashSet();
      return voznik;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorVoznik() {
      if (voznik == null)
         voznik = new java.util.HashSet();
      return voznik.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newVoznik */
   public void setVoznik(java.util.Collection newVoznik) {
      removeAllVoznik();
      for (java.util.Iterator iter = newVoznik.iterator(); iter.hasNext();)
         addVoznik((Voznik)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newVoznik */
   public void addVoznik(Voznik newVoznik) {
      if (newVoznik == null)
         return;
      if (this.voznik == null)
         this.voznik = new java.util.HashSet();
      if (!this.voznik.contains(newVoznik))
         this.voznik.add(newVoznik);
   }
   
   /** @pdGenerated default remove
     * @param oldVoznik */
   public void removeVoznik(Voznik oldVoznik) {
      if (oldVoznik == null)
         return;
      if (this.voznik != null)
         if (this.voznik.contains(oldVoznik))
            this.voznik.remove(oldVoznik);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllVoznik() {
      if (voznik != null)
         voznik.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection getTrip() {
      if (trip == null)
         trip = new java.util.HashSet();
      return trip;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTrip() {
      if (trip == null)
         trip = new java.util.HashSet();
      return trip.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTrip */
   public void setTrip(java.util.Collection newTrip) {
      removeAllTrip();
      for (java.util.Iterator iter = newTrip.iterator(); iter.hasNext();)
         addTrip((Trip)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTrip */
   public void addTrip(Trip newTrip) {
      if (newTrip == null)
         return;
      if (this.trip == null)
         this.trip = new java.util.HashSet();
      if (!this.trip.contains(newTrip))
         this.trip.add(newTrip);
   }
   
   /** @pdGenerated default remove
     * @param oldTrip */
   public void removeTrip(Trip oldTrip) {
      if (oldTrip == null)
         return;
      if (this.trip != null)
         if (this.trip.contains(oldTrip))
            this.trip.remove(oldTrip);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTrip() {
      if (trip != null)
         trip.clear();
   }

}