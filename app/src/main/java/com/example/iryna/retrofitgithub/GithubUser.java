package com.example.iryna.retrofitgithub;

/**
 * Created by iryna on 16.08.16.
 */
public class GithubUser {
    String login;
    String name;
    String location;
    String public_repos;
    String email;

    @Override
    public String toString() {
        return(login);
    }

}
