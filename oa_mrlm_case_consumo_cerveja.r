dados <- read.csv(file = "C:/Consumo_cerveja.csv", sep = "," )
View(dados)

names(dados)[names(dados) == "Consumo.de.cerveja..litros."] <- "consumo"
str(dados)

is.na(dados$consumo)


new_dados <- na.omit(dados)

View(new_dados)

#Resp1
sum(new_dados$consumo)

#Resp2
meses1 <- as.Date(new_dados$Data)
class(meses1)
months(meses1)
new_dados$Data <- as.Date(new_dados$Data)
str(new_dados) #Vemos agora que a coluna Data é do tipo "Date" 

#Podemos ver que se usarmos o comando months para uma data, otemos:
months(new_dados$Data)

#Portanto, podemos obter o consumo de cada mês da seguinte maneira:
consumo_janeiro = sum(new_dados[months(new_dados$Data) == "janeiro",]$consumo)
consumo_fevereiro = sum(new_dados[months(new_dados$Data) == "fevereiro",]$consumo)
consumo_marco = sum(new_dados[months(new_dados$Data) == "março",]$consumo)
consumo_abril = sum(new_dados[months(new_dados$Data) == "abril",]$consumo)
consumo_maio = sum(new_dados[months(new_dados$Data) == "maio",]$consumo)
consumo_junho = sum(new_dados[months(new_dados$Data) == "junho",]$consumo)
consumo_julho = sum(new_dados[months(new_dados$Data) == "julho",]$consumo)
consumo_agosto = sum(new_dados[months(new_dados$Data) == "agosto",]$consumo)
consumo_setembro = sum(new_dados[months(new_dados$Data) == "setembro",]$consumo)
consumo_outubro = sum(new_dados[months(new_dados$Data) == "outubro",]$consumo)
consumo_novembro = sum(new_dados[months(new_dados$Data) == "novembro",]$consumo)
consumo_dezembro = sum(new_dados[months(new_dados$Data) == "dezembro",]$consumo)

#Teste se bate com sum da coluna consumo, OK!
sum(consumo_janeiro, consumo_fevereiro, consumo_marco, consumo_abril, consumo_maio,
    consumo_junho, consumo_julho, consumo_agosto, consumo_setembro, consumo_outubro,
    consumo_novembro, consumo_dezembro)

#Jogamos em um array (usando o comando "c") cada consumo:
meses_consumo <- c(consumo_janeiro, consumo_fevereiro, consumo_marco, consumo_abril, consumo_maio,
    consumo_junho, consumo_julho, consumo_agosto, consumo_setembro, consumo_outubro,
    consumo_novembro, consumo_dezembro)

#Resp2 - Ordenamos para obter o melhor mês: Janeiro
sort(meses_consumo, decreasing = TRUE)
consumo_janeiro


#Resp3 - chuva interfere no consumo? vamos mudar o nome da coluna para facilitar:
names(new_dados)[names(new_dados) == "Precipitacao..mm."] <- "chuva"
View(new_dados)
class(new_dados$chuva) #fator -> devemos transformar em numerico...e trocar "," por "." 

#new_dados$chuva <- new_dados2$chuva
new_dados$chuva <- gsub(",", "\\.", new_dados$chuva)
new_dados$chuva <- as.numeric(new_dados$chuva) #voltamos a numérico para poder fazer cálculos

#Somando precipitação de cada mês:
chuva_janeiro = sum(new_dados[months(new_dados$Data) == "janeiro",]$chuva)
chuva_fevereiro = sum(new_dados[months(new_dados$Data) == "fevereiro",]$chuva)
chuva_março = sum(new_dados[months(new_dados$Data) == "março",]$chuva)
chuva_abril = sum(new_dados[months(new_dados$Data) == "abril",]$chuva)
chuva_maio = sum(new_dados[months(new_dados$Data) == "maio",]$chuva)
chuva_junho = sum(new_dados[months(new_dados$Data) == "junho",]$chuva)
chuva_julho = sum(new_dados[months(new_dados$Data) == "julho",]$chuva)
chuva_agosto = sum(new_dados[months(new_dados$Data) == "agosto",]$chuva)
chuva_setembro = sum(new_dados[months(new_dados$Data) == "setembro",]$chuva)
chuva_outubro = sum(new_dados[months(new_dados$Data) == "outubro",]$chuva)
chuva_novembro = sum(new_dados[months(new_dados$Data) == "novembro",]$chuva)
chuva_dezembro = sum(new_dados[months(new_dados$Data) == "dezembro",]$chuva)

#Jogamos em um array (usando o comando "c") cada volume de chuva:
meses_chuva <- c(chuva_janeiro, chuva_fevereiro, chuva_março, chuva_abril, chuva_maio,
                 chuva_junho, chuva_julho, chuva_agosto, chuva_setembro, chuva_outubro,
                 chuva_novembro, chuva_dezembro)
meses_chuva


#3. Chuva interfere no consumo de cerveja?
barplot(meses_chuva, names.arg = meses_consumo)
for(i in length(meses_chuva)){
      print(meses_chuva)
}

for (j in length(meses_consumo)) {
      print(meses_consumo)
}
cor(meses_chuva, meses_consumo) 
#A correlação é baixa! Não interfere 

#4.	Final de semana tem alguma relação com o consumo? Quanto aumenta?
consumo_janeiro

#Somando consumo de cada mês qdo final de semana:
#Para pegarmos os finais de semana de janeiro:
new_dados[months(new_dados$Data) == "janeiro" & new_dados$Final.de.Semana == 1,]$consumo 


consumo_jan_fds = sum(new_dados[months(new_dados$Data) == "janeiro" 
                                & new_dados$Final.de.Semana == 1,]$consumo)


consumo_jan_NAO_fds = sum(new_dados[months(new_dados$Data) == "janeiro" 
                                & new_dados$Final.de.Semana == 0,]$consumo)

consumo_janeiro 
consumo_jan_NAO_fds + consumo_jan_fds

proporcao_jan_fds_Nfds = consumo_jan_NAO_fds / consumo_janeiro
proporcao_jan_fds_fds = consumo_jan_fds / consumo_janeiro
#Ou seja, os finais de semana em janeiro correspondem a 33% do consumo do mês.

#Quanto aumenta?
#Se fosse SEM final de semana o consumo de janeiro é: 599.523
#Quando colocamos o final de semana o consumo sobe: 289.484
#Ou seja, 

aumento_jan_fds = consumo_jan_fds / consumo_jan_NAO_fds

aumento_jan_fds
#Aumento de quase 50% =>aproximadamento 0.48

########Fazer isso para os outros meses para verificar o aumento do FDS para cada mês.


#5.	Mostre um gráfico relacionando data e consumo.
library(ggplot2)

ggplot(data = new_dados, aes(x = Data, y = consumo, group(Data))) +
  geom_bar(stat = "identity", fill = "blue") +
  labs(x = "Date",
    y = "Total consumo (litros)",
    title = "Distribuição do Consumo",
    subtitle = "de Cervejas, 2015")

#6.	Crie um modelo para fazer predições.
#7.	Mostre os coeficientes deste modelo.
#8.	Faça uma predição de consumo para a data (2015-01-01), temperatura média(28), mínima(25), máxima(35), precipitação (0) e final de semana (SIM).

#Temos que transformar "," em "." para as temperatuas para poder gerar o modelo:
class(new_dados$Temperatura.Media..C.) 
#fator -> devemos transformar em numerico...e trocar "," por "." 

new_dados$Temperatura.Media..C. <- gsub(",", "\\.", new_dados$Temperatura.Media..C.)
new_dados$Temperatura.Media..C. <- as.numeric(new_dados$Temperatura.Media..C.) 
#voltamos a numérico para poder fazer cálculos

new_dados$Temperatura.Minima..C. <- gsub(",", "\\.", new_dados$Temperatura.Minima..C.)
new_dados$Temperatura.Minima..C. <- as.numeric(new_dados$Temperatura.Minima..C.) 
#voltamos a numérico para poder fazer cálculos

new_dados$Temperatura.Maxima..C. <- gsub(",", "\\.", new_dados$Temperatura.Maxima..C.)
new_dados$Temperatura.Maxima..C. <- as.numeric(new_dados$Temperatura.Maxima..C.) 
#voltamos a numérico para poder fazer cálculos

regmultBreja <- lm(consumo ~ ., data = new_dados)
regmultBreja

predict(regmultBreja, 
        newdata = data.frame(Data= as.Date("2015-01-01"),
                             Temperatura.Media..C. = 28,
                             Temperatura.Minima..C.= 25,
                             Temperatura.Maxima..C.= 35,
                             chuva = 0,
                             Final.de.Semana = 1)
        )



#Poderíamos ter feito isso antes, como não estamos usando as temperaturas
#vamos retirar estas colunas, pois além de não serem usadas, estão com 
#vírgula ao invés de ponto:
library(dplyr)
sub_new_dados <- new_dados
# Drop the columns of the dataframe
sub_dados = select (sub_new_dados,-c(2,3,4))

View(sub_dados)

regmultCerva <- lm(consumo ~ ., data = sub_dados)
regmultCerva

















