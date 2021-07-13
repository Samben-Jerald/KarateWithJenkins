function (){
var config={
name:'Samben',
clientId: karate.properties['karate.clientId'] || 'xyz',
baseUrl: karate.properties['karate.baseUrl'] ||'https://reqres.in/api/users?page=2'
}
return config;
}

