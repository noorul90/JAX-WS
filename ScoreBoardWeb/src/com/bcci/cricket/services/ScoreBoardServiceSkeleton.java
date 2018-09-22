/**
 * ScoreBoardServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.bcci.cricket.services;

import com.bcci.cricket.types.ErrorDetails;
import com.bcci.cricket.types.Score;

/**
 *  ScoreBoardServiceSkeleton java skeleton for the axisService
 */
public class ScoreBoardServiceSkeleton
    implements ScoreBoardServiceSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param match0
     * @return score1
     * @throws MatchNotFoundFault
     */
    public com.bcci.cricket.types.Score getInningScore(
        com.bcci.cricket.types.Match match) throws MatchNotFoundFault {
        //TODO : fill this with the necessary business logic
       /* //dummy logic-1
    	if(match.getTeam1().equalsIgnoreCase("india") && match.getTeam2().equalsIgnoreCase("pakistan")){
        Score score=null;
        score = new Score();
        score.setInningNo(1);
        score.setBattingTeam("INDIA");
        score.setBowlingTeam("PAKISTAN");
        score.setBowlingOver(2.5f);
        score.setRunningScore(46);
        score.setWicket(0);
        
        return score;
        
    	}
    	else{
    		throw new MatchNotFoundFault("sorry match has been cancelled due to heavy rain");
    	}*/
    	
    	//Dummy logic-2
    	if(match.getTeam1()==null || match.getTeam2()==null){
    		ErrorDetails errDet=null;
    		errDet = new ErrorDetails();
    		errDet.setErrorCode("101");
    		errDet.setErrorDescr("field error");
    		MatchNotFoundFault fault=null;
    		fault = new MatchNotFoundFault("Invalid inputs");
    		fault.setFaultMessage(errDet);
    		
    		throw fault;
    	}
    	
    	 Score score=null;
         score = new Score();
         score.setInningNo(1);
         score.setBattingTeam("INDIA");
         score.setBowlingTeam("PAKISTAN");
         score.setBowlingOver(2.5f);
         score.setRunningScore(46);
         score.setWicket(0);
         
         return score;
         
       //run the Ant tool it create and copy ScoreBoardWeb.aar file in build directory	
           
    }
}
