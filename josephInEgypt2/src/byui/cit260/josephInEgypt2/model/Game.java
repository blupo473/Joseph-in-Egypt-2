/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.model;

import java.io.Serializable;
/**
 *
 * @author Britt
 */
public class Game implements Serializable{
    
    //class instance variables
    private double totalTime;
    private double livesSaved;

    public Game() {
    }
    
    
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public double getLivesSaved() {
        return livesSaved;
    }

    public void setLivesSaved(double livesSaved) {
        this.livesSaved = livesSaved;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", livesSaved=" + livesSaved + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.livesSaved) ^ (Double.doubleToLongBits(this.livesSaved) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.livesSaved) != Double.doubleToLongBits(other.livesSaved)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
