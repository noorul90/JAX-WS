/**
 * ScoreBoardServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.bcci.cricket.services;

/**
 *  ScoreBoardServiceSkeletonInterface java skeleton interface for the axisService
 */
public interface ScoreBoardServiceSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param match
     * @throws MatchNotFoundFault :
     */
    public com.bcci.cricket.types.Score getInningScore(
        com.bcci.cricket.types.Match match) throws MatchNotFoundFault;
}
