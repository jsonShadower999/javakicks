// player,teams,matches,inning
@getters
@setters
@NoArgsConstructor
@AllArgsConstructor
public class Player{
    private String name;
    private int rating;
    private int total_last_played_tours;
    
    
}


// team is full of 11 playes

public class Team{
    private String name_team;
    private List<Player> players_list;
    public Team(String name_team,List<Player> players_list){
        this.name_team=name_team;
        this.players_list=players_list;
    }
}

public class Match{
    private MatchFormat matchformat;
    private List<Inning> innings;
    private Map<String,Team> teams;
    //teamname n teamobj 
    private Team winteam;
    private Team lossteam;
    private MatchResult matchres;
    private Toss toss_res;
}
public class Toss{
    private String decision;
    private Team winteam;
    private Team lossteam;
}

// inning=over , run , wickets 
public class Innings{
    private List<Over> overs;
    private Runs totalruns;
    private List<Wicket> wickets;
}
public class Over{
    private List<Ball> balls;

}
public class Commentaryevent{
    private LocalDateTime timestamp;
    private int over;
    private int ball;
    private String msg;
    private Team team_current;
    private Player current_player;

}

class Commentry{
    private Match match;
    private List<Commentaryevent> Commentaryevent;
}