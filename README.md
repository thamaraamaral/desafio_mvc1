#DESAFIO MVC

##PRIMEIRO MOMENTO: Recebemos o projeto e levei três dias entendendo como funcionaria o relacionamento entre as entidades, quais eram as regras do negócio. Fiz pesquisas sobre banco de dados,conversei com pessoas que trabalham com análise de dados para entender se o meu pensamento estava correto e assim começar a codar as classes de Java Bean. Elaborei uma documentação inicial no notion em que fiz uma UML inicial e fiz um desenho das ações do programa. https://www.notion.so/Desafio-MVC-95dd0f48f7a247d9b628b7ffe5d39e40

###EVOLUÇÃO COM AS DIFICULDADES Quando iniciei o desevolvimento do projeto, comecei utilizando como referência o projeto estudado durante a semana de estudos sobre o MVC. Assim, utilizei Thymeleaf e Hibernate para a manipulação dos dados. Procurei outros vídeos, documentações e códigos para me ajudar entender como resolver o desafio.

Utilizando como base um código de uma agenda de contatos, consegui criar um Evento e vincular atividades a ele. No front-end, o usuário conseguia ao apertar um sinal de + para inserir uma nova atividade e um sinal de - remover o campo.

Ao evoluir o projeto, tive dificuldade para entender a manusear o thymeleaf e o material que eu já havia estudado, me dava mais confiança para para utilizar outras ferramentas.

Depois de certo momento de insegurança, decidi recomeçar a codar a partir do que eu me sentia mais confortável, a iniciar pelo cadastro do usuário. A partir daqui, optei que usaria JDBC ao invés de hibernate. Para o cadastro do usuário, eu procurei salvar a senha com criptografia md5, para que senha seja salva criptografada no banco de dados. Fiz validações para todos os campos do formulário utilizando JQuery Validade.

Recomecei a codar a parte do back-end da aplicação utilizando JDBC, assim tive que alterar praticamente todo o ambiente que eu tinha. Dessa vez, para me ajudar utilizei o LOMBOK para criação das classe Java Bean. Inicialmente, comecei a fazer o crud do Evento.

Optei pela criação de páginas JSP e assim poder utilzar TAGLIBS para manipular os dados inseridos no front-end.

Na parte de consulta do evento utilizei JQUERY Datatables para a formatação e a consulta os eventos é dada através da seleção de um período de tempo selecionado pelo usuário.

Após conseguir cadastrar o evento, consultá-lo e editá-lo, iniciei a parte do crud de grupo.

COMENTÁRIOS
Percebi que subestimei algumas etapas. Aprendi bastante sobre banco de dados. Revi conceitos de bootstrap, JQUERY validade. Ainda não terminei o projeto, mas seguirei sua implementação.