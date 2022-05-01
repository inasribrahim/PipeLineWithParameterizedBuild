properties([parameters([string(description: 'Please enter a branch Name ', name: 'branchName')])])

 node {''
        stage('SCM Checkout') {
            
                echo "current branch is: ${branchName}" 
                git  url: 'https://github.com/inasribrahim/automatedSearchEngine.git' , branch:'${branchName}'

    }
        
    }


