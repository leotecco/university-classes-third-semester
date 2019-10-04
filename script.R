consumo_cerveja <- read.csv("C:/Users/Laboratorio/Downloads/consumo_cerveja.csv", sep = ",")

names(consumo_cerveja)[names(consumo_cerveja) == "Consumo.de.cerveja..litros."] <- "consumo"

View(consumo_cerveja)

novo_consumo_cerveja = na.omit(consumo_cerveja)

View(novo_consumo_cerveja)

# 1
sum(novo_consumo_cerveja$consumo)
class(novo_consumo_cerveja$Data)
novo_consumo_cerveja$Data <- as.Date(novo_consumo_cerveja$Data)
months(novo_consumo_cerveja$Data)

consumo_janeiro = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "janeiro", ]$consumo)
consumo_fevereiro = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "fevereiro", ]$consumo)
consumo_marco = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "março", ]$consumo)
consumo_abril = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "abril", ]$consumo)
consumo_maio = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "maio", ]$consumo)
consumo_junho = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "junho", ]$consumo)
consumo_julho = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "julho", ]$consumo)
consumo_agosto = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "agosto", ]$consumo)
consumo_setembro = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "setembro", ]$consumo)
consumo_outubro = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "outubro", ]$consumo)
consumo_novembro = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "novembro", ]$consumo)
consumo_dezembro = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "dezembro", ]$consumo)

meses_consumo <- c(consumo_janeiro,
  consumo_fevereiro,
  consumo_marco,
  consumo_abril,
  consumo_maio,
  consumo_junho,
  consumo_julho,
  consumo_agosto,
  consumo_setembro,
  consumo_outubro,
  consumo_novembro,
  consumo_dezembro)

sort(meses_consumo, decreasing = TRUE)
# 2
plot(meses_consumo)


# 3

names(novo_consumo_cerveja)[names(novo_consumo_cerveja) == "Precipitacao..mm."] <- "chuva"
View(novo_consumo_cerveja)

novo_consumo_cerveja$chuva <- gsub(",", "\\.", novo_consumo_cerveja$chuva)
novo_consumo_cerveja$chuva <- as.numeric(novo_consumo_cerveja$chuva)

chuva_janeiro = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "janeiro", ]$chuva)
chuva_fevereiro = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "fevereiro", ]$chuva)
chuva_marco = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "março", ]$chuva)
chuva_abril = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "abril", ]$chuva)
chuva_maio = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "maio", ]$chuva)
chuva_junho = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "junho", ]$chuva)
chuva_julho = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "julho", ]$chuva)
chuva_agosto = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "agosto", ]$chuva)
chuva_setembro = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "setembro", ]$chuva)
chuva_outubro = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "outubro", ]$chuva)
chuva_novembro = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "novembro", ]$chuva)
chuva_dezembro = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "dezembro", ]$chuva)

meses_chuva <- c(
  chuva_janeiro,
  chuva_fevereiro,
  chuva_marco,
  chuva_abril,
  chuva_maio,
  chuva_junho,
  chuva_julho,
  chuva_agosto,
  chuva_setembro,
  chuva_outubro,
  chuva_novembro,
  chuva_dezembro
)

# 3
barplot(meses_chuva, names.arg = meses_chuva)
cor(meses_chuva, meses_consumo)

# 4
consumo_jan_fds = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "janeiro" & 
                        novo_consumo_cerveja$Final.de.Semana == 1, ]$consumo)

consumo_jan_nao_fds = sum(novo_consumo_cerveja[months(novo_consumo_cerveja$Data) == "janeiro" & 
                                             novo_consumo_cerveja$Final.de.Semana == 0, ]$consumo)

aumento_jan_fds <- consumo_jan_fds / consumo_jan_nao_fds

# 5
plot(me)