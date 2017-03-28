cd me-adote-config;
sudo docker build -t wnascimento/me-adote-config .;
cd ..;

cd me-adote-discovery;
sudo docker build -t wnascimento/me-adote-discovery .;
cd ..;

cd me-adote-gateway;
sudo docker build -t wnascimento/me-adote-gateway .;
cd ..;

cd me-adote-owners;
sudo docker build -t wnascimento/me-adote-owners .;
cd ..;

cd me-adote-pets;
sudo docker build -t wnascimento/me-adote-pets .;
cd ..;

cd me-adote-comments;
sudo docker build -t wnascimento/me-adote-comments .;
cd ..;
