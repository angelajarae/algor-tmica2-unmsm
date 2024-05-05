/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electoral;

/**
 *
 * @author angela
 */
public class Election {
    private int _numberCandidates;
    private int _numberTables;
    private Candidate _candidates[];
    private ElectoralTable _tables[];

    public Election(int numberCandidates, int numberTables){
        _numberCandidates = numberCandidates;
        _numberTables = numberTables;
        _candidates = new Candidate[ _numberCandidates ];
        _tables = new ElectoralTable[ _numberTables ];
        char name = 'a';
        
        for(int i =0; i < _candidates.length; i++){
            _candidates[i] = new Candidate(i,String.valueOf(name));
            int number = (char)name;
            number++;
            name = (char)number;
        }
        
        for(int i =0; i < _tables.length; i++ ){
            int numberElectors =(int)(Math.random()*150)+50;
            _tables[i] = new ElectoralTable(i, getNumberCandidates(), numberElectors);
        } 
        
    }
    
    public String voting(){
            for(int m = 0; m < _tables.length; m++){
                int elector = 1;
                while( elector <_tables[m].getNumberElectors()){
                    int vote = (int)(Math.random()*_numberCandidates);
                    _tables[m].toVote( vote );
                    elector++;
                }
            }
            return "The electoral process has I finish";
    }
    
    public String consolidated(){
        for(int m=0; m < _tables.length; m++){
            for(int c = 0; c < _candidates.length; c++){
                _candidates[c].addingVotes(_tables[m].quantityVotes( c ) );
            }
        }
        return "The process of consolidated has finished";
    }
    
    public String winner(){
        int major = 0;
        int position = -1;
        for( int i= 0; i < _numberCandidates; i++){
            if( _candidates[i].getVotes() > major ){
                major = _candidates[i].getVotes();
                position = i;
            }
        }
        String strings = " The winner is: " +_candidates[position].getName() +" with this following votes: " +_candidates[position].getVotes();
        return strings;
    }
        

    /**
     * @return the _numberCandidates
     */
    public int getNumberCandidates() {
        return _numberCandidates;
    }

    /**
     * @param _numberCandidates the _numberCandidates to set
     */
    public void setNumberCandidates(int _numberCandidates) {
        this._numberCandidates = _numberCandidates;
    }

    /**
     * @return the _numberTables
     */
    public int getNumberTables() {
        return _numberTables;
    }

    /**
     * @param _numberTables the _numberTables to set
     */
    public void setNumberTables(int _numberTables) {
        this._numberTables = _numberTables;
    }

    /**
     * @return the _candidates
     */
    public Candidate[] getCandidates() {
        return _candidates;
    }

    /**
     * @param _candidates the _candidates to set
     */
    public void setCandidates(Candidate[] _candidates) {
        this._candidates = _candidates;
    }

    /**
     * @return the _tables
     */
    public ElectoralTable[] getTables() {
        return _tables;
    }

    /**
     * @param _tables the _tables to set
     */
    public void setTables(ElectoralTable[] _tables) {
        this._tables = _tables;
    }
}
