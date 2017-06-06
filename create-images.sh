echo 'Creating docker images'
{
    cd me-adote-config; 
    sudo docker build -t wnascimento/me-adote-config .;
    cd ..;
} &> /dev/null
echo 'created image docker config'

{
    cd me-adote-discovery;
    sudo docker build -t wnascimento/me-adote-discovery .;
    cd ..;
} &> /dev/null
echo 'created image docker discovery'

{
    cd me-adote-gateway;
    sudo docker build -t wnascimento/me-adote-gateway .;
    cd ..;
} &> /dev/null
echo 'created image docker gateway'

{
    cd me-adote-owners;
    sudo docker build -t wnascimento/me-adote-owners .;
    cd ..;
} &> /dev/null
echo 'created image docker owners'

{
    cd me-adote-pets;
    sudo docker build -t wnascimento/me-adote-pets .;
    cd ..;
} &> /dev/null
echo 'created image docker pets'