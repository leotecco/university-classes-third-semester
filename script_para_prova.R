# SCRIPT PARA A PROVA

milsa <- read.csv("C:/Users/tecco/Desktop/navarro/milsa.csv")

View(milsa) #visualiza��o
summary(milsa) #amostragem
head(milsa) #amostra do dataframe
str(milsa) #estrutura do dataframe, tipos e valores

# Frequ�ncia Absolutas
civil.tb <- table(milsa$Est.civil)
# F de Frequ�ncia
cbind("f" = civil.tb)
# Com somat�rio
cbind("f" = addmargins(civil.tb))

# Frequ�ncia Relativa (Em porcentagem)
cbind("f" = prop.table(civil.tb))

# Gr�fico de Barras
par(mfrow = c(1, 2)) # Dividir a janela em 2
barplot(civil.tb, ylab = "Frequ�ncia absoluta")
barplot(prop.table(civil.tb), ylab = "Frequ�ncia relativa", ylim = c(0, 0.6))

# Gr�fico de Pizza
par(mfrow = c(1, 1)) # Voltar a janela para 1
pie(civil.tb) # Gr�fico de Pizza

# Moda
names(civil.tb)[which.max(civil.tb)]

# Vari�vel Qualitativa Ordinal
inst.tb <- table(milsa$Inst)
cbind("f" = addmargins(inst.tb), "fr" = addmargins(prop.table(inst.tb)))
barplot(inst.tb)

# Vari�vel quantitativa discreta
filhos.tb <- table(milsa$Filhos)
cbind("f" = addmargins(filhos.tb)) 
plot(filhos.tb, xlab = "N�mero de filhos", ylab = "Frequ�ncia absoluta") 

# Vari�vel quantitativa cont�nua
sort(milsa$Salario)
max(milsa$Salario)
min(milsa$Salario)
mean(milsa$Salario) # M�dia
plot(milsa$Salario, xlab = "�ndice", ylab = "Sal�rio")


# MRL M�ltipla
precoapartamentos <- read_excel("C:/Users/tecco/Desktop/navarro/preco_de_apartamentos.xlsx")

regmult1 <- lm (precoapartamentos$pre�o ~ precoapartamentos$tamanho + precoapartamentos$`idade do pr�dio`, data=precoapartamentos)
summary(regmult1) # p-value 2,052 x 10 ^ -5 = 0,00002052
# Valor F de significancia p-value < 0,05 h� evidencias estat�sticas
# 
# Para prever um imovel, utilizar
# (Intercept) 440107         
# precoapartamentos$tamanho 6772  
# precoapartamentos$`idade do pr�dio` -19130 
#
# y(preco que desejamos pesquisar) = intercept + 6772 * tamanho desejado +  -19130 idade do predio


# MRLM para todas as vari�veis
regmult2 <- lm (precoapartamentos$pre�o ~ . , data = precoapartamentos)
regmult2 #nos d� os coeficientes caso desejemos usar
summary(regmult2)
# OBSERVAR R�

# Regress�o Log�stica
puffinbill <- read.csv("C:/Users/tecco/Desktop/navarro/puffinbill.csv", header = TRUE, sep = ",")
View(puffinbill)
modelopf <- glm(puffinbill$sex ~ puffinbill$cur, binomial)
summary(modelopf)
#              Estimate Std. Error z value Pr(>|z|)    
# (Intercept)    -56.3369 = theta0 
# puffinbill$cur   1.3053 = theta1
#


# Predi��o
str(puffinbill)
amostra<- sample(nrow(puffinbill), nrow(puffinbill) * .6)
ordenado<- sort(amostra)

treino <- puffinbill[ordenado, ]
teste <- puffinbill[-ordenado, ]

modelotreinamento <- glm(sex ~ curlen, family = binomial, data = treino)
previsao <- predict(modelotreinamento, teste, type = "response")
previsao.alterado <- ifelse(previsao >= 0.5, "M", "F")
