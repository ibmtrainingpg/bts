console.log("js loaded");


function saveBug() {
    function success(response) {
        console.log(response);
        return response.json();
    }
    function errorHandler(error) {
        console.log(error);
    }
    const createBug = document.getElementById('createBug');

    if (!createBug.checkValidity()) {
        alert('form is invalid');
        return;
    }
    const promise = fetch('/bug', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            title: document.getElementById('title').value,
            description: document.getElementById('description').value,
            status: document.getElementById('status').value,
            priority: document.getElementById('priority').value,
            type: document.getElementById('type').value,
            submitOnDate: document.getElementById('submitOnDate').valueAsDate,
            buildVersion: document.getElementById('buildVersion').value,
            projectId: document.getElementById('projectId').value,
            module: document.getElementById('module').value,
            product: document.getElementById('product').value,
        })
    });
    promise.then(success);
    promise.then(function (data) {
        console.log(data);
    })
    promise.catch(errorHandler);

}
//=================GetBugs Method=====================================
function getBugs() {
    const promise = fetch('/bug');
    promise.then(function (response) {
        return response.json();
    })
        .then(function (bugs) {
            console.log(bugs);
            const table = document.getElementById('bugsTable');
            for (let index = 0; index < bugs.length; index++) {
                console.log(bugs[index]);
                const currentBug = bugs[index];
                const row = document.createElement('tr');
                const titleColumn = document.createElement('td');
                const descriptionColumn = document.createElement('td');
                const statusColumn = document.createElement('td');
                const priorityColumn = document.createElement('td');
                const typeColumn = document.createElement('td');
                const submitOnDateColumn = document.createElement('td');
                const buildVersionColumn = document.createElement('td');
                const projectIdColumn = document.createElement('td');
                const moduleColumn = document.createElement('td');
                const productColumn = document.createElement('td');

                titleColumn.append(currentBug.title);
                descriptionColumn.append(currentBug.description);
                statusColumn.append(currentBug.status);
                priorityColumn.append(currentBug.priority);
                typeColumn.append(currentBug.type);
                submitOnDateColumn.append(currentBug.submitOnDate);
                buildVersionColumn.append(currentBug.buildVersion);
                projectIdColumn.append(currentBug.projectId);
                moduleColumn.append(currentBug.module);
                productColumn.append(currentBug.product);
                row.appendChild(titleColumn);
                row.appendChild(descriptionColumn);
                row.appendChild(statusColumn);
                row.appendChild(priorityColumn);
                row.appendChild(typeColumn);
                row.appendChild(submitOnDateColumn);
                row.appendChild(buildVersionColumn);
                row.appendChild(projectIdColumn);
                row.appendChild(moduleColumn);
                row.appendChild(productColumn);
                table.appendChild(row);
            }
        })
}

//====================GetBugsById=====================================
function getBug() {
    let id = document.getElementById('bugId').value;
    const promise = fetch('/bug/' + id);
    promise.then(function (response) {
        return response.json();
    })
        .then(function (bug) {
            console.log(bug);
            const table = document.getElementById('bugsTable');
            const row = document.createElement('tr');
            const titleColumn = document.createElement('td');
            const descriptionColumn = document.createElement('td');
            const statusColumn = document.createElement('td');
            const priorityColumn = document.createElement('td');
            const typeColumn = document.createElement('td');
            const submitOnDateColumn = document.createElement('td');
            const buildVersionColumn = document.createElement('td');
            const projectIdColumn = document.createElement('td');
            const moduleColumn = document.createElement('td');
            const productColumn = document.createElement('td');

            titleColumn.append(bug.title);
            descriptionColumn.append(bug.description);
            statusColumn.append(bug.status);
            priorityColumn.append(bug.priority);
            typeColumn.append(bug.type);
            submitOnDateColumn.append(bug.submitOnDate);
            buildVersionColumn.append(bug.buildVersion);
            projectIdColumn.append(bug.projectId);
            moduleColumn.append(bug.module);
            productColumn.append(bug.product);
            row.appendChild(titleColumn);
            row.appendChild(descriptionColumn);
            row.appendChild(statusColumn);
            row.appendChild(priorityColumn);
            row.appendChild(typeColumn);
            row.appendChild(submitOnDateColumn);
            row.appendChild(buildVersionColumn);
            row.appendChild(projectIdColumn);
            row.appendChild(moduleColumn);
            row.appendChild(productColumn);
            table.appendChild(row);
        })
}

//===============================UpdateBug====================================
function updateBug() {
    function success(response) {
        console.log(response);
        return response.json();
    }
    function errorHandler(error) {
        console.log(error);
    }
    //Form Validation
    //updateBug is the id of updateBug form
    const updateBug = document.getElementById('updateBug');
    if (!updateBug.checkValidity()) {
        alert('form is invalid');
        return;
    }

    let id = document.getElementById('bugId').value;

    // const promise1 = fetch('/bug/' + id, {
    //     method: 'GET',
    //     headers: {
    //         'Content-Type': 'application/json'
    //     },
    //     body: JSON.stringify({
    //         projectId: document.getElementById('projectId').value,
    //         priority: document.getElementById('priority').value,
    //         title: document.getElementById('title').value,
    //         type: document.getElementById('type').value

    //     })

    // });

    // promise1.then(success);
    // promise1.then(function (data) {
    //     console.log(data);
    // })
    // promise1.catch(errorHandler);


    const promise = fetch(('/bug/' + id), {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            status: document.getElementById('status').value,
            description: document.getElementById('description').value,
            title: document.getElementById('title').value,
            submitOnDate: document.getElementById('submitOnDate').value
        })
    });

    promise.then(success);
    promise.then(function (data) {
        console.log(data);
    })
    promise.catch(errorHandler);
}
