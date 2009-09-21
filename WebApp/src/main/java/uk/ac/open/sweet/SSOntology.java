package uk.ac.open.sweet;

import java.util.HashMap;

import uk.ac.open.kmi.watson.clientapi.EntityResult;
import uk.ac.open.kmi.watson.clientapi.SemanticContentResult;
import uk.ac.open.sweet.context.*;


public class SSOntology {
	
	//public SemanticContentResult sc;
   // public EntityResult ntt;
    
    //public String context;

    public SSOntology() {
    }

   /* public SSOntology(SemanticContentResult sc, EntityResult ntt, String context) {
        this.sc         = sc;
        this.ntt        = ntt;
        this.context    = context;
        this.type = "";
        this.label ="";
    }*/
    
    /*public String getLabel(){
    	return this.label;
    }*/
    
    public Match containsTerm(String term, String context){
    	String s = "";
    	for(int i=0; i<getOntologyConcepts().length; i++){
    		s = getOntologyConcepts()[i].toLowerCase().trim();
    		if(s.equalsIgnoreCase(term.toLowerCase().trim())|| s.contains(term.toLowerCase().trim()))
    		{
    			EntityResult er = new EntityResult();
    	    	er.setURI("http://sweet.kmi.open.ac.uk/ssontology" + getOntologyConcepts()[i]);
    	    	er.setType("Class");
    	    	er.setLabel(getOntologyConcepts()[i]);
    	    	er.setComment("Class" + " " + getOntologyConcepts()[i]);
    	    	
    	    	SemanticContentResult scr = new SemanticContentResult();
    	    	scr.setURI("http://sweet.kmi.open.ac.uk/ssontology.rdfs");
    	    	scr.setNBClasses(19);
    	    	scr.setNBProperties(31);
    	    	scr.setNBIndividuals(0);
    	    	String[] lang = new String[1];
    	    	lang[0] = "English";
    	    	scr.setLanguages(lang);
    	    	//scr.setSize(19,31);
    	    	
    	    	Match m = new Match(scr, er, context);
    	    	
    			return m;
    		}
    	}
    	
    	for(int j=0; j<getOntologyProperties().length; j++){
    		s = getOntologyProperties()[j].toLowerCase().trim();
    		if(s.equalsIgnoreCase(term.toLowerCase().trim())|| s.contains(term.toLowerCase().trim()))
    		{
    			EntityResult er = new EntityResult();
    	    	er.setURI("http://sweet.kmi.open.ac.uk/ssontology" + getOntologyProperties()[j]);
    	    	er.setType("Property");
    	    	er.setLabel(getOntologyProperties()[j]);
    	    	er.setComment("Property" + " " + getOntologyProperties()[j]);
    	    	
    	    	SemanticContentResult scr = new SemanticContentResult();
    	    	scr.setURI("http://sweet.kmi.open.ac.uk/ssontology.rdfs");
    	    	scr.setNBClasses(19);
    	    	scr.setNBProperties(33);
    	    	scr.setNBIndividuals(0);
    	    	String[] lang = new String[1];
    	    	lang[0] = "English";
    	    	scr.setLanguages(lang);
    	    	//scr.setSize(19,31);
    	    	
    	    	Match m = new Match(scr, er, context);
    	    	
    			return m;
    		}
    	}
    	
    	return null;        	
    }
    
    public String getURI(){
    	String uri = "http://sweet.kmi.open.ac.uk/ssontology.rdfs";
    		return uri;
    }
    
   /* public SemanticContentResult getSemanticContentResult()
    {
    	SemanticContentResult scr = new SemanticContentResult();
    	scr.setURI("http://sweet.kmi.open.ac.uk/ssontology.rdfs");
    	scr.setNBClasses(19);
    	scr.setNBProperties(31);
    	scr.setNBIndividuals(0);
    	String[] lang = new String[1];
    	lang[0] = "English";
    	scr.setLanguages(lang);
    	//scr.setSize(19,31);
    	

    	return scr;    	*/
    	/*this.DLExpressivness = DLExpressivness;
           this.comments = comments;
           this.entityResultList = entityResultList;
           this.importedBy = importedBy;
           this.imports = imports;
           this.labels = labels;
           this.languages = languages;
           this.locations = locations;
           this.nbStatements = nbStatements;
           this.numberOfStatements = numberOfStatements;
           this.size = size;*/
    //}
    
    /*public EntityResult getEntityResult(String term)
    {
    	EntityResult er = new EntityResult();
    	er.setURI("http://sweet.kmi.open.ac.uk/ssontolog#");
    	er.setType(this.type);
    	er.setLabel(this.label);
    	er.setComment(this.type + " " + this.label);
    	return er;    	
    	/*
           this.literals = literals;*/
    //}
    
   /*public Match getMatch(String term){    	
    	Match m = new Match(this.getSemanticContentResult(),this.getEntityResult(term), "foo");
    	
    	return m;
    	//m.getEntityResult().getURI();
    	
    	//attr.put("type", e.getEntityResult().getType());
        //attr.put("localName", NameSpace.splitNamespace(e.getEntityResult().getURI())[1]);
        //attr.put("URI", e.getEntityResult().getURI());
       // h.put(e.getEntityResult().getURI(), attr);
    }*/
    
    private String[] getOntologyProperties(){
    	String[] SsontologyProperties = new String[33];
    	SsontologyProperties[0] = "#childrenGeoNames";
    	SsontologyProperties[1] = "#featureClass";
    	SsontologyProperties[2] = "#featureCode";
    	SsontologyProperties[3] = "#geonameId";
    	SsontologyProperties[4] = "#inCountry";
    	SsontologyProperties[5] = "#latitude";
    	SsontologyProperties[6] = "#locatedIn";
    	SsontologyProperties[7] = "#locationMap";
    	SsontologyProperties[8] = "#longitude";
    	SsontologyProperties[9] = "#nearby";
    	SsontologyProperties[10] = "#nearbyGeoNames";
    	SsontologyProperties[11] = "#neighbour";
    	SsontologyProperties[12] = "#neighbouringGeoNames";
    	SsontologyProperties[13] = "#parentGeoName";
    	SsontologyProperties[14] = "#tag";
    	SsontologyProperties[15] = "#wikipediaArticle";
    	SsontologyProperties[16] = "#Capital";
    	SsontologyProperties[17] = "#City";
    	SsontologyProperties[18] = "#alternateName";
    	SsontologyProperties[19] = "#country_code";
    	SsontologyProperties[20] = "#elevation";
    	SsontologyProperties[21] = "#language";
    	SsontologyProperties[22] = "#name";
    	SsontologyProperties[23] = "#officialName";
    	SsontologyProperties[24] = "#population";
    	SsontologyProperties[25] = "#postalCode";
    	SsontologyProperties[26] = "#elevation";
    	SsontologyProperties[27] = "#timezone";
    	SsontologyProperties[28] = "#lat";
    	SsontologyProperties[29] = "#lng";
    	SsontologyProperties[30] = "#maxRows";    	
    	SsontologyProperties[31] = "#placename"; 
    	SsontologyProperties[32] = "#style"; 
    	
    	return SsontologyProperties;
    }
    
    public String[] getOntologyConcepts(){
    	String[] OntologyConcepts = new String[19];
    	OntologyConcepts[0] = "#Bounding_box";
    	OntologyConcepts[1] = "#Class";
    	OntologyConcepts[2] = "#Code";
    	OntologyConcepts[3] = "#Country";
    	OntologyConcepts[4] = "#GeoName";
    	OntologyConcepts[5] = "#Map";
    	OntologyConcepts[6] = "#RDFData";
    	OntologyConcepts[7] = "#Radius";
    	OntologyConcepts[8] = "#WikipediaArticle";
    	OntologyConcepts[9] = "#Envelope";
    	OntologyConcepts[10] = "#Geometry";
    	OntologyConcepts[11] = "#LineString";
    	OntologyConcepts[12] = "#LinearRing";
    	OntologyConcepts[13] = "#Point";
    	OntologyConcepts[14] = "#Polygon";
    	OntologyConcepts[15] = "#SpatialThing";
    	OntologyConcepts[16] = "#Address";
    	OntologyConcepts[17] = "#Intersection";
    	OntologyConcepts[18] = "#Street"; 

    	return OntologyConcepts;
    }
}
