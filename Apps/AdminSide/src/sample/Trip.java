package sample; /***********************************************************************
 * Module:  Trip.java
 * Author:  Korisnik
 * Purpose: Defines the Class Trip
 ***********************************************************************/

import java.util.*;

/** @pdOid 970f55d4-e4b7-4d60-86f2-ba567f990378 */
public class Trip {
   /** @pdOid b2d31015-5a47-4e58-9ee3-0540ea000823 */
   private int cena;
   /** @pdOid 0397218c-0bd2-4398-88bb-816bd273dba1 */
   public String startMesto;
   /** @pdOid d63e0eb7-09f9-445f-970c-06e1d5c6c9df */
   public String endMesto;
   /** @pdOid 237fee6b-a4c3-456c-9339-74dc8ace80cc */
   private java.lang.Object voznik;
   /** @pdOid f43d9a5f-05cc-42c7-ae79-83ee92691d05 */
   private int steviloSedez;
   
   /** @pdRoleInfo migr=no name=Sedez assc=association5 mult=1 */
   public Sedez sedez;
   /** @pdRoleInfo migr=no name=Termin assc=association7 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection termin;
   
   /** @pdOid bc387a2b-5cf7-41e6-a10c-6e72a815bfd0 */
   public int vrniSeznamVozenj() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid c2970fa2-02a6-40c9-b707-401b258be3cf */
   public int vrniPodrobnostiVoznje() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 6bae72c5-83a9-42ba-8018-b36fba0f520b */
   public int posodobiPoDogovoru() {
      // TODO: implement
      return 0;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection getTermin() {
      if (termin == null)
         termin = new java.util.HashSet();
      return termin;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTermin() {
      if (termin == null)
         termin = new java.util.HashSet();
      return termin.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTermin */
   public void setTermin(java.util.Collection newTermin) {
      removeAllTermin();
      for (java.util.Iterator iter = newTermin.iterator(); iter.hasNext();)
         addTermin((Termin)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTermin */
   public void addTermin(Termin newTermin) {
      if (newTermin == null)
         return;
      if (this.termin == null)
         this.termin = new java.util.HashSet();
      if (!this.termin.contains(newTermin))
         this.termin.add(newTermin);
   }
   
   /** @pdGenerated default remove
     * @param oldTermin */
   public void removeTermin(Termin oldTermin) {
      if (oldTermin == null)
         return;
      if (this.termin != null)
         if (this.termin.contains(oldTermin))
            this.termin.remove(oldTermin);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTermin() {
      if (termin != null)
         termin.clear();
   }

}