echo 'Build Projects'

{
    cd me-adote-config;
    mvn clean install;
    cd ..;
} &> /dev/null
echo 'install service config'

{
   cd me-adote-discovery;
    mvn clean install;
    cd ..;

} &> /dev/null
echo 'install service discovery'

{
    cd me-adote-gateway;
    mvn clean install;
    cd ..;
} &> /dev/null
echo 'install service gateway'

{
    cd me-adote-owners;
    mvn clean install;
    cd ..;
} &> /dev/null
echo 'install service owners'


{
    cd me-adote-pets;
    mvn clean install;
    cd ..;
} &> /dev/null
echo 'install service pets'




