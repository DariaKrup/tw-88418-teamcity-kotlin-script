# teamcity-kotlin-script

Update from teamcity server 2023.05.6 to 2023.11 causes the following error:

```
script/github-token.main.kts [1:7]: Unresolved reference: Repository
script/github-token.main.kts [2:7]: Unresolved reference: DependsOn
```

Steps to reproduce:
1. Execute local teamcity server version 2023.11
```
docker run --name teamcity-server-instance -v $HOME/teamcity/data:/data/teamcity_server/datadir -v $HOME/teamcity/logs:/opt/teamcity/logs -p 8111:8111 jetbrains/teamcity-server:2023.11
```
2. Link with remove vcs root with DSL settings
3. Load project settings from VCS
