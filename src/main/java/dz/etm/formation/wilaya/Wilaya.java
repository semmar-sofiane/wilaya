package dz.etm.formation.wilaya;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Wilaya {
          private int id;
          private boolean actif;
          private int compte_creation;
          private int compte_maj;
          private String date_creation;
          private String date_maj;
          private String nom_arabe;
          private String nom_latin;
          private String nom_tamzight;
          
          public Wilaya(int id, boolean actif, int compte_creation, int compte_maj, String date_creation, String date_maj,
  				String nom_arabe, String nom_latin, String nom_tamzight) {
  			this.id = id;
  			this.actif = actif;
  			this.compte_creation = compte_creation;
  			this.compte_maj = compte_maj;
  			this.date_creation = date_creation;
  			this.date_maj = date_maj;
  			this.nom_arabe = nom_arabe;
  			this.nom_latin = nom_latin;
  			this.nom_tamzight = nom_tamzight;
  		}
          
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public boolean isActif() {
			return actif;
		}
		public void setActif(boolean actif) {
			this.actif = actif;
		}
		public int getCompte_creation() {
			return compte_creation;
		}
		public void setCompte_creation(int compte_creation) {
			this.compte_creation = compte_creation;
		}
		public int getCompte_maj() {
			return compte_maj;
		}
		public void setCompte_maj(int compte_maj) {
			this.compte_maj = compte_maj;
		}
		public String getDate_creation() {
			return date_creation;
		}
		public void setDate_creation(String date_creation) {
			this.date_creation = date_creation;
		}
		public String getDate_maj() {
			return date_maj;
		}
		public void setDate_maj(String date_maj) {
			this.date_maj = date_maj;
		}
		public String getNom_arabe() {
			return nom_arabe;
		}
		public void setNom_arabe(String nom_arabe) {
			this.nom_arabe = nom_arabe;
		}
		public String getNom_latin() {
			return nom_latin;
		}
		public void setNom_latin(String nom_latin) {
			this.nom_latin = nom_latin;
		}
		public String getNom_tamzight() {
			return nom_tamzight;
		}
		public void setNom_tamzight(String nom_tamzight) {
			this.nom_tamzight = nom_tamzight;
		}

		@Override
		public String toString() {
			return String.format("%d %b %d %d %s %s %s %s %s"
					,Integer.valueOf(id),Boolean.valueOf(actif),Integer.valueOf(compte_creation),Integer.valueOf(compte_maj)
					,date_creation,date_maj,nom_arabe,nom_latin,nom_tamzight);
		}
       
          
}
