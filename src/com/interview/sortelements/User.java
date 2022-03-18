package com.interview.sortelements;

import java.util.Comparator;

public class User implements Comparable<User>, Comparator<User> {

    private Integer id;
    private String fname;
    private String lname;

    public User( Integer id, String fname, String lname )
    {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    /**
     * @return the id
     */
    public Integer getId()
    {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId( Integer id )
    {
        this.id = id;
    }

    /**
     * @return the fname
     */
    public String getFname()
    {
        return fname;
    }

    /**
     * @param fname
     *            the fname to set
     */
    public void setFname( String fname )
    {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname()
    {
        return lname;
    }

    /**
     * @param lname
     *            the lname to set
     */
    public void setLname( String lname )
    {
        this.lname = lname;
    }

    @Override
    public int compareTo( User o )
    {
        // TODO Auto-generated method stub
        return o.getId() - this.getId();
    }

    @Override
    public int compare( User o1, User o2 )
    {
        // TODO Auto-generated method stub
        return 0;
    }

}
